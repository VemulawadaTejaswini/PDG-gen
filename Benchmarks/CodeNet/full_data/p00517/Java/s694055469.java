import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		//int map[][]=new int[H+1][W+1];//添字が座標
		int nowx,nowy,direx,direy,count=0;
		
		nowx=sc.nextInt();
		nowy=sc.nextInt();
		for(int z=1;z<N;z++){
			direx=sc.nextInt();
			direy=sc.nextInt();
			while(true){
				if(nowx==direx && nowy==direy) break; //保険　?
				else if(direx>nowx){//???
					if(direy>nowy){//?
						nowx++;	
						nowy++;
						count++;
					}
					else if(direy<nowy){//?
						nowx++;
						nowy--;
						count+=2;
					}
					else if(direy==nowy){//?
						nowx++;
						count++;
					}
				}
				else if(direx<nowx){//４３８
					if(direy<nowy){//?
						nowx--;
						nowy--;
						count++;
					}
					else if(direy>nowy){//3
						nowx--;
						nowy++;
						count+=2;
					}
					else if(direy==nowy){
						nowx--;
						count++;	
					}
				}
				else if(direx==nowx){//５６
					if(direy<nowy){
						nowy--;
						count++;
					}
					else if(direy>nowy){
						nowy++;
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
	}

}