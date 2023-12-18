import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a = new int[n];
    int[] c = new int[n];
    Arrays.fill(c,-1);
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    c[0]=a[0];
    int valie=1;
    int mip=-1;
    for(int i=1;i<n;i++){
        for(int j=0;j<valie;j++){
            if(a[i]>c[j]&&(mip==-1||c[mip]<c[j])){
                mip=j;
            }
        }
        if(mip==-1){
            c[valie]=a[i];
            valie++;
        }else{
            c[mip]=a[i];
        }
    }
    System.out.println(valie);
  }
}