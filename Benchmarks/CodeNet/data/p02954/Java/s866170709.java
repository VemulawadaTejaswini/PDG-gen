import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s=sc.next();

      s = s + 'R';

      int lng =s.length();

      char r = 'R';
      char l = 'L';

      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }

      int[] num = new int[lng];
      for(int i=0;i<lng;i++){
        num[i] = 0;
      }

      int cnt=0;
      int numR;
      int numL;
      int flag=0;

      for(int i=0;i<lng-1;i++){
        cnt++;
        if(c[i]==l && c[i+1]==r){//if LR finds
        //////////////////////////////////////////////////////
          for(int j=flag;j<=i;j++){//find RL
            if(c[j]==r && c[j+1]==l){//if RL finds
              numL = i-j-1;
              numR = cnt - numL - 2;
              num[j] = calcL(cnt,numR,numL);
              num[j+1] = calcR(cnt,numR,numL);
              flag = i+1;
              cnt=0;
              break;
            }
          }
        /////////////////////////////////////////////////////
        }
      }

////////////////////////////////////////////////
      for(int i=0;i<lng-1;i++){
        System.out.print(num[i]+" ");
      }
////////////////////////////////////////////////
    }

    public static int calcL(int cn,int rr,int ll){
      int ans=0;
      if(cn%2==0){
        ans = cn/2;
      }
      else if(rr%2==0){
        ans = (cn+1)/2;
      }
      else if(rr%2==1){
        ans = (cn-1)/2;
      }
      return ans;
    }
    public static int calcR(int cn,int rr,int ll){
      int ans=0;
      if(cn%2==0){
        ans = cn/2;
      }
      else if(rr%2==0){
        ans = (cn-1)/2;
      }
      else if(rr%2==1){
        ans = (cn+1)/2;
      }
      return ans;
    }

}
