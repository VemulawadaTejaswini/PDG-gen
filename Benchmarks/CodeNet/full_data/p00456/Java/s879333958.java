import java.util.Scanner;

class Main{

	Main(){
		Scanner scan = new Scanner(System.in);	
		int[] w = new int[10];
		int[] k = new int[10];
		w=this.init(w);
		k=this.init(k);	
		int[] ans1;
		int[] ans2;
		
		for(int i=0;i<10;i++){
			w[i]=scan.nextInt();
		}
		for(int i=0;i<10;i++){
			k[i]=scan.nextInt();
		}
		
		ans1=this.sort(w);
		ans2=this.sort(k);
		
		

		System.out.print(ans1[0]+ans1[1]+ans1[2]+" ");
		System.out.println(ans2[0]+ans2[1]+ans2[2]);
	}

	int[] init(int[] w){
		for(int i=0;i<w.length;i++){
			w[i]=0;
		}	
		return w;
	}

	int[] sort(int[] array){
		int[] sArray = new int[3];
		init(sArray);
		for(int i=0;i<array.length;i++){
			if(array[i]>sArray[2]){
				if(array[i]>sArray[1]){
					if(array[i]>sArray[0]){
						sArray[2]=sArray[1];
						sArray[1]=sArray[0];
						sArray[0]=array[i];
						
						continue;
					}
					sArray[2]=sArray[1];	
					sArray[1]=array[i];
					continue;
				}
				sArray[2]=array[i];
				continue;
			}

			

		}

		return sArray;
	}

	public static void main(String[] args){
		Main a = new Main();
	}


}