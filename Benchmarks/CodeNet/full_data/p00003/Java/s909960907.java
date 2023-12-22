import java.util.Scanner;
class Main{

	
	public static void main(String[] a) {
		Scanner keyboad=new Scanner(System.in);
		int e,r,t=0;
		int i[]=new int[1000];
		int j[]=new int[1000];
		int l[]=new int[1000];
		
		int kai=keyboad.nextInt();
		
		for(int k=0;k<kai;k++){
		String str1 =keyboad.nextLine();
		String[] bun = str1.split(" ");
		
		e= Integer.parseInt(bun[0]);
		r= Integer.parseInt(bun[1]);
		t= Integer.parseInt(bun[2]);
		i[k]=e;
		j[k]=r;
		l[k]=t;
		}
		
		int mob[][]=new int[kai][3];
		int kau[][]=new int [kai][3];
		int max[][]=new int[kai][3];
		
			for(int b=0;b<kai;b++){
			for(int s=0;s<3;s++){
				if (i[b] > j[b]) {
					max[b][s] = i[b];
					mob[b][s] = i[b];
					kau[b][s]=1;
				} else {
					max[b][s] = j[b];
					mob[b][s] = j[b];
					kau[b][s]=2;
				}
				
				if (l[b] > max[b][s]) {
					max[b][s] = l[b];
					mob[b][s] = l[b];
					kau[b][s]=3;
				}
			if(kau[b][s]==1)i[b]=-1;
			else if(kau[b][s]==2)j[b]=-1;
			else if(kau[b][s]==3)l[b]=-1;
			}
	
			}
			for(int z=0;z<kai;z++){
				if(max[z][0]*max[z][0]==max[z][1]*max[z][1]+max[z][2]*max[z][2]){
					System.out.println("YES");
				}else System.out.println("NO");
			}
		}
		
	}