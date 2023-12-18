import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    HashMap<HashMap<String,Integer>,Integer> maps = new HashMap<HashMap<String,Integer>,Integer>();
    int n = sc.nextInt();
    String s[] = new String[n];
    int p[] = new int[n];
    int a[] = new int[n];
    String stmp="";
    int ptmp = -1;
    int atmp =0;
    for(int i=0;i<n;i++){
      s[i]=sc.next();
      p[i]=sc.nextInt();
      a[i]=i+1;
    }
    for(int j=0;j<n-1;j++){
    for(int i=0;i<n-1;i++){
      if(s[i].compareTo(s[i+1])>0){
        atmp = a[i];
        a[i] = a[i+1];
        a[i+1] = atmp;
        stmp = s[i];
        s[i] = s[i+1];
        s[i+1] = stmp;
        ptmp = p[i];
        p[i] = p[i+1];
        p[i+1] = ptmp;  
      }else if(s[i].compareTo(s[i+1])==0){
        if(p[i]<p[i+1]){
        atmp = a[i];
        a[i] = a[i+1];
        a[i+1] = atmp;
        stmp = s[i];
        s[i] = s[i+1];
        s[i+1] = stmp;
        ptmp = p[i];
        p[i] = p[i+1];
        p[i+1] = ptmp;
        }
      }else{
      }
    }

    }
    for(int k =0;k<n;k++){
      
    System.out.println(a[k]);
    }
    
  }
}