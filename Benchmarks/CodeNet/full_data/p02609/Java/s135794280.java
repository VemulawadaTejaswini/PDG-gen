import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    char[] c=sc.next().toCharArray();
    for(int i=0;i<n;i++){
      if(c[i]=='1'){
        f++;
      }
    }
    int d=0;
    for(int i=0;i<n;i++){
      d=f;
      if(c[i]=='1'){
        c[i]='0';
        d--;
      }else{
        c[i]='1';
        d++;
      }
      if(c[n-1]=='1'&&f>1){
        System.out.println(2);
      }else{
        System.out.println(1);
      }
    }
  }
}
