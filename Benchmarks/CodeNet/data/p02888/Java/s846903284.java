import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] L = new int[n];
      for(int i=0;i<n;i++){
        L[i] = Integer.parseInt(sc.next());
      }
      //System.out.println("");

      Arrays.sort(L);
      for(int i=0;i<n;i++){
        //System.out.print(L[i]+" ");
      }
      //System.out.println("");

      int ans = 0;

      for(int i=n-1;i>=0;i--){
        for(int j=i-1;j>=0;j--){
//////////////////////////////////////////////////////

int start = 0;
int end = j;
int sa = L[i]-L[j];
int cnt = -1;
while(true){
  int a = start+end;
  int mid = a/2;
  if(L[mid]>sa){ //L[mid以降]は使える。
    end = mid;
  }
  else if(L[mid]<=sa){ //L[mid以前]は使えない
    start = mid;
  }

  if(a==(start+end) && L[mid]>sa){
    cnt = mid;  //L[mid以降]は使えることの記録。
    //System.out.println(L[i]+","+L[j]+"のとき"+L[cnt]+"が最小の棒。"+"saは"+sa);
    break;
  }
  if(a==(start+end) && L[mid+1]>sa){
    cnt = mid+1;  //L[mid+1以降]は使えることの記録。
    //System.out.println(L[i]+","+L[j]+"のとき"+L[cnt]+"が最小の棒。"+"saは"+sa);
    break;
  }
  if(a==(start+end) && L[mid]<=sa){
    break;
  }
}
//使えるのはL[j]の次に小さいやつまでなので、
if(cnt!=-1){
  for(int k=j;k>0;k--){
    if(L[k]!=L[k-1]){ //L[k-1]から使える。
      ans += (k-1)-(cnt)+1;
      //System.out.println(((k-1)-(cnt)+1)+"個加算。");
      break;
    }
  }
}
//////////////////////////////////////////////////////
        }
      }


      System.out.println(ans);

    }
}
