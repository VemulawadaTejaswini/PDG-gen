import java.util.*;
class Main /*atcoder beginner contest 42*/{
	public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt() , l = s.nextInt();
			
			int[] pre = new int[10];
			for(int i = 0;i < l;i++){
				int dig = s.nextInt();
				pre[dig] = 1;
			}

			String np = n+"";
			int[] no = new int[np.length()];
			int indx = np.length()-1;
			while(n != 0){
				int p = n%10;
				no[indx] = p;
				n/=10;
				indx--;
			}
/*
			for(int i = 0;i  < no.length;i++)
				System.out.print(no[i]);
			System.out.println();
*/
			for(int i = 0;i  < no.length;i++){
				int ele = no[i];
				// System.out.println(ele);
				if(pre[ele] == 1){

					if(i == 0){
						for(int j = ele;j <= 9;j++){
							if(pre[j] != 1 ){
								no[i] = j;
								break;
							}
						}
					}
					else{
						for(int j = ele;j <= 9;j++){
							if(pre[j] != 1){
								no[i] = j;
								break;
							}
						}
					}

				}
			}

			for(int i = 0;i < no.length;i++)
				System.out.print(no[i]);
			System.out.println();

	}
}