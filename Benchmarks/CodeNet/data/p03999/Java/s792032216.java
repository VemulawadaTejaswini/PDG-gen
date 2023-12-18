import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      int s = S.length()-1;
      String[] op = new String[s];
      long ans=0;
      for(int i=0;i<(Math.pow(2,s));i++){
        for(int p=0;p<s;p++){
        op[p]="";
        }
        for(int j=0;j<s;j++){
          if((1&i>>j)==1){
            op[j]="a";
          }
        }
        String str="";
        for(int k=0;k<s;k++){
          str = str+String.valueOf(S.charAt(k))+op[k];
        }
        str = str+String.valueOf(S.charAt(s));
        String[] a = str.split("a");
        for(int l=0;l<a.length;l++){
          ans+=Long.parseLong(a[l]);
        }
      }
      System.out.println(ans); 
    }
}