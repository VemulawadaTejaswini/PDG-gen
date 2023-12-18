import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
      long result=0;
      char[][] arr = new char[n][];
      for(int i=0;i<n;i++){
        String s = scan.next();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        arr[i]=c;
        for(int j=0;j<i;j++){
          boolean match=true;
          for(int k=0;k<10;k++){
            if(arr[j][k]!=c[k]){
              match=false;
              break;
            }
          }
          if(match){
            result++;
          }
        }
      }
      System.out.println(result);

	}      
}
