import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int spot[][]=new int [n][2];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<2; j++)
				spot[i][j]=sc.nextInt();
			
		int X=spot[0][0];
		int Y=spot[0][1];
		int counter = 0;
		
		for(int i=1; i<=n;){//どこ目指してるのかな
			int XX=spot[i][0] - X;
			int YY=spot[i][1] - Y;
			
			if(XX!=0 && YY!=0){  //どっちも違う
				if(XX>0 && YY>0){ //右上
					X++;
					Y++;
					counter++;
				}
				else if(XX<0 && YY<0){ //左下
					X--;
					Y--;
					counter++;
				}
				else if(XX>0 && YY<0){ //右下
					X++;
					Y--;
					counter+=2;
				}
				else if(XX<0 && YY>0){ //左上
					X--;
					Y++;
					counter+=2;
				}
			}
			else if(XX==0 && YY!=0){ //Xは同じ
				if(YY>0) Y++;
				else if(YY<0) Y--;
				counter++;
			}
			else if(XX!=0 && YY==0){ //Yは同じ
				if(XX>0) X++;
				else if(XX<0) X--;
				counter++;
			}
			
			else if(XX==0 && YY==0){
				i++;
			}
		}
		
		System.out.println(counter);


	}

}