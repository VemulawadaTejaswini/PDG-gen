import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String s =sc.next();
    int S =s.length();
    long K=sc.nextLong();
    String T[] =s.split("",0);
    List<String> t=Arrays.asList(T);
    String a[] ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int b[] =new int[26];
    b[0]=0;
    for(int i=1;i<26;i++){
      b[i]=-i+26;}
    for(int j=0;j<S;j++){
      for(int k=0;k<26;k++){
        if(T[j].equals(a[k])){
          if(b[k]<K){t.set(j,"a");K=K-b[k];}
          if(j==S-1){
             long m =K%26;
            int n =(int) m;
            k=k+n;
            k=k%26;
            t.set(S-1,a[k]);}
        }
      }
    }
    String M[] = t.toArray(new String[t.size()]);
    String ans =M[0];
    for(int l=1;l<S;l++){
      ans =ans+M[l];}
    System.out.println(ans);
  }
}