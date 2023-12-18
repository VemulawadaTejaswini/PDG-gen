import java.util.*;

class Main2{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cond = sc.nextInt();

		int pos[] = new int[num];
		int left[] = new int[cond];
		int right[] = new int[cond];
		int deg[] = new int[cond];

		final int OOV = -11111;

		for(int c=0;c<cond;c++){
			left[c] = sc.nextInt()-1;
			right[c] = sc.nextInt()-1;
			deg[c] = sc.nextInt();
		}

		for(int n=0;n<num;n++){
			pos[n] = OOV;
		}

		for(int c=0;c<cond;c++){

			if(pos[left[c]] == OOV){

				 pos[ left[c] ] = 0;

				 if(pos[right[c] ] != deg[c] && pos[right[c] ] != OOV){
				 	answer(-1);
				 	return;
				 }
				 else pos[right[c] ] = deg[c];
			}
			else{
				
				if(right[c] > left[c]){

					if(pos[right[c] ] != pos[left[c]]+deg[c] && pos[right[c] ] != OOV){
						answer(-1);
						return;
					}
					pos[right[c] ] = pos[left[c]]+deg[c];
				}
				else{

					if(pos[right[c] ] != pos[left[c]]-deg[c] && pos[right[c] ] != OOV){
						answer(-1);
						return;
					}
					pos[right[c] ] = pos[left[c]]-deg[c];
				}
			}
			
		}

		answer(1);


	}

	private static void answer(int n){

		if(n==1) System.out.println("Yes");
		else 	 System.out.println("No");

	}
}