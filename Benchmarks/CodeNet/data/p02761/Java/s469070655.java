import java.util.Scanner;
public class Main {
  	public static void main(String[] args){
      //入力値の取得
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] array = new int[m][2];
	  for (int i=0; i < m; i++) {
		  sc.nextLine();
		  array[i][0] = sc.nextInt();
		  array[i][1] = sc.nextInt();
	  }
	  sc.close();

	  //検査対象整数
	  int min=(int) Math.pow(10, n-1);
	  if (n==1) {
		  min=0;
	  }
	  int max=(int) Math.pow(10, n)-1;

	  int answer=-1;
	  outer: for(int i=min; i<=max; i++) {
		  char[] target = Integer.toString(i).toCharArray();
		  for(int j=0; j<m; j++) {
			  if (!String.valueOf(target[array[j][0]-1]).equals(Integer.toString(array[j][1]))) {
				  break;
			  }
			  if (j==m-1) {
				  answer=i;
				  break outer;
			  }
		  }
	  }
	  System.out.println(answer);
  	}
}