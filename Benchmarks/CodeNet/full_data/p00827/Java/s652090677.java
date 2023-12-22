import java.util.*;

public class Main{
	int acount,bcount;
	int a,b,d;
	int minNum;
	public void min(int i ,int j){
		if((i+j)<minNum){
			minNum = i+j;
			acount=i;
			bcount=j;
		}
		else if((i+j)==minNum){
			if((i*a)+(j*b) <= (acount*a)+(bcount*b)){
				minNum = i+j;
				acount=i;
				bcount=j;
			}
		}
	}

	public void keisan(int a ,int b, int d){
		for(int i=0;i<=10000;i++){
			for(int j=0;j<=10000;j++){
				if(d==(i*a)+(j*b)){//??¬??????a???b???
					min(i,j);
				}
				if(d+(i*a)==j*b){//??¬???a??????b???
					min(i,j);
				}
				if(d+(j*b)==i*a){//??¬???b??????a???
					min(i,j);
				}
			}
		}
	}


	public void run(){
		Scanner scan = new Scanner(System.in);
		while(true){
			a = scan.nextInt();//a?????????
			b = scan.nextInt();//b?????????
			d = scan.nextInt();//?±?????????¬?????????
			if(a==0 && b==0 && d==0) break;
			acount=0;
			bcount=0;
			minNum=20000;
			keisan(a,b,d);
			System.out.println(acount+ " "+bcount);
		}
	}


  public static void main(String[] args){
		Main app = new Main();
		app.run();
	}
}