import java.util.*;
public class Main {
  int[][] a=new int[3][3];
	public static void main(String[] args){
      int hantei=0;
		Scanner sc = new Scanner(System.in);
      for(int i=0;i<3;i++){
        for(int k=0;k<3;k++){
		int tugi = sc.nextInt();
          a[i][k]=tugi;
        }
      }
      int N=sc.nextInt();
      boolean[][] kekka=new boolean[3][3];
      for(int i=0;i<3;i++){
        for(int k=0;k<3;k++){
		kekka[i][k]=false;
        }
      }
      for(int i=0;i<N;i++){
        int now=sc.nextInt();
        for(int i=0;i<3;i++){
        for(int k=0;k<3;k++){
          if(a[i][k]==now){
            kekka[i][k]=true;
          }
        }
      }
        if(kekka[0][0]==true&&kekka[0][1]==true&&kekka[0][2]==true){
          hantei=1;
          break;
        }
        if(kekka[1][0]==true&&kekka[1][1]==true&&kekka[1][2]==true){
          hantei=1;
          break;
        }
        if(kekka[2][0]==true&&kekka[2][1]==true&&kekka[2][2]==true){
          hantei=1;
          break;
        }
        if(kekka[0][0]==true&&kekka[1][0]==true&&kekka[2][0]==true){
          hantei=1;
          break;
        }
        if(kekka[0][1]==true&&kekka[1][1]==true&&kekka[2][1]==true){
          hantei=1;
          break;
        }
        if(kekka[0][2]==true&&kekka[1][2]==true&&kekka[2][2]==true){
          hantei=1;
          break;
        }
        if(kekka[0][0]==true&&kekka[1][1]==true&&kekka[2][2]==true){
          hantei=1;
          break;
        }
        if(kekka[0][2]==true&&kekka[1][1]==true&&kekka[2][0]==true){
          hantei=1;
          break;
        }
      }
      if(hantei==1){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
	}
}
