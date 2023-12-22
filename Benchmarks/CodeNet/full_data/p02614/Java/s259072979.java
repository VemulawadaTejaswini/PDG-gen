import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();//行
      	int w = sc.nextInt();//列
      	int k = sc.nextInt();//条件
      	int count_Bl=0;//黒の数
      	int result=0;//合致するパターン数
      	int[][] board =new int[h][w];
      

      
          
    	for(int i=0;i<h;i++){
          String input=sc.next();
          for(int j=0;j<w;j++){
            if(input.charAt(j)=='#'){
           		board[i][j] = 1;//要素の打ち込み 
            }else{
            	board[i][j] = 0;//要素の打ち込み
            }
            
          }
        }  
      
      	/*for(int i=0;i<h;i++){//打ち込みがうまくいってるかの確認用
          for(int j=0;j<w;j++){
            System.out.print(board[i][j]);
          }
        }*/  
		
      
      	for(int i=0;i<Math.pow(2,h);i++){//塗りつぶしを2進数で表現
          String paH=String.format("%6s",Integer.toBinaryString(i));
          //System.out.println(paH);//二進数への変換の確認用
          for(int j=0;j<Math.pow(2,w);j++){
            String paW=String.format("%6s",Integer.toBinaryString(j));
            
            for(int n=0;n<h;n++){
              for(int m=0;m<w;m++){
                if(paH.charAt(6-h+n)!='1' && paW.charAt(6-w+m)!='1'){
                  if(board[n][m]==1){
                    count_Bl+=1;
                  }
                }
              }   
            }
           
         	if(count_Bl==k){
              result+=1;
              //System.out.println(paH+paW+"!");//何が条件をクリアしたかの確認
          	}
            count_Bl=0;//カウントのリセット
          } 
        }
          
    	System.out.println(result);
    } 
}















