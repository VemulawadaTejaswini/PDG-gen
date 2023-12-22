//import java.awt.List;
import java.util.Random;
import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	 //List list = new List();
	  Random ran = new Random();
	  
	  int num = sc.nextInt();
	  int max = 0;
	  int min = 0;
	  int sum = 0;
	  
	  for(int i = 0 ; i < num ; i++){
		  int rannum = ran.nextInt();
		  System.out.println(rannum);
		  sum = sum + rannum;
		  
		  if (max < rannum) {	//現在の最大値よりも大きい値が出たら
				max = rannum;	//変数maxに値を入れ替える
			}
			if (min > rannum) {	//現在の最小値よりも小さい値が出たら
				min = rannum;	//変数minに値を入れ替える
			}
		  
	  }
	  
	  System.out.println(max + " " + min + " " +sum);

  }
}