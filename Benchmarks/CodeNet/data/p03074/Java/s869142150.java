import java.util.*;

public class D124{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());

      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }

      int[] kore = new int[n];
      int[] or01 = new int[n];
      int cnt = 0;
      for(int i=0;i<n-1;i++){
        if(c[i]==c[i+1]){
          kore[cnt]++;
        }
        else{
          if(c[i]=='0'){
            or01[cnt] = 0;
          }
          else{
            or01[cnt] = 1;
          }
          cnt++;
        }
      }
      for(int i=0;i<=cnt;i++){
        kore[i]++;
      }

//////main////////////////////////////////////
int range = 2*k+1;
int ans = 0;
int max = 0;
for(int i=-k;i<=lng-range;i++){

if(i<0){
//////////////////////////////////
for(int j=0;j<range+i;j++){
  max += kore[j];
}
//////////////////////////////////
}
else if(0<=i && i<=lng-range){
//////////////////////////////////
  if(or01[i]==1){
    for(int j=i;j<i+range;j++){
      max += kore[j];
    }
  }
//////////////////////////////////
}
else if(lng-range<i){
//////////////////////////////////
for(int j=i;j<lng;j++){
  max += kore[j];
}
//////////////////////////////////
}
  ans = Math.max(ans,max);
  max = 0;
}
System.out.println(ans);
//////////////////////////////////////////////

      /*for(int kores : kore){
        System.out.println(kores);
      }*/

    }
}
