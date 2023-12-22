import java.util.Scanner;

public class Main{
	static void judge(int[] dic1,int[] dic2){
		for(int i=0;i<6;i++){
			if(dic1[i]!=dic2[i]){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int[] dic1=new int[6];
		int[] dic2=new int[6];
		
		for(int i=0;i<6;i++) dic1[i]=scan.nextInt();
		for(int i=0;i<6;i++) dic2[i]=scan.nextInt();
		
		int top=dic1[1];
		int left=dic1[5];
		int tmp;
		
		if(top==dic2[5]){
			tmp=dic2[1];
			dic2[1]=dic2[5];
			dic2[5]=dic2[4];
			dic2[4]=dic2[0];
			dic2[0]=tmp;
		}
		if(top==dic2[3]){
			tmp=dic2[1];
			dic2[1]=dic2[3];
			dic2[3]=dic2[4];
			dic2[4]=dic2[2];
			dic2[2]=tmp;
		}
		if(top==dic2[0]){
			tmp=dic2[1];
			dic2[1]=dic2[0];
			dic2[0]=dic2[4];
			dic2[4]=dic2[5];
			dic2[5]=tmp;
		}
		if(top==dic2[2]){
			tmp=dic2[1];
			dic2[1]=dic2[2];
			dic2[2]=dic2[4];
			dic2[4]=dic2[3];
			dic2[3]=tmp;
		}
		if(top==dic2[4]){
			tmp=dic2[1];
			dic2[1]=dic2[4];
			dic2[4]=tmp;
			tmp=dic2[3];
			dic2[3]=dic2[2];
			dic2[2]=tmp;
		}
		
		if(dic2[2]==left||dic2[5]==left||dic2[3]==left||dic2[0]==left){
			if(dic2[5]==left){
				judge(dic1,dic2);
			}else if(dic2[3]==left){
				tmp=dic2[3];
				dic2[3]=dic2[0];
				dic2[0]=dic2[2];
				dic2[2]=dic2[5];
				dic2[5]=tmp;
				judge(dic1,dic2);
			}else if(dic2[0]==left){
				tmp=dic2[0];
				dic2[0]=dic2[5];
				dic2[5]=tmp;
				tmp=dic2[3];
				dic2[3]=dic2[2];
				dic2[2]=tmp;
				judge(dic1,dic2);
			}else{
				tmp=dic2[2];
				dic2[2]=dic2[0];
				dic2[0]=dic2[3];
				dic2[3]=dic2[5];
				dic2[5]=tmp;
				judge(dic1,dic2);
			}
		}else{
			System.out.println("No");
		}
		
		scan.close();
	}
}