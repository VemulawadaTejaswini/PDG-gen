import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }
      int ans = 0;
      int cnt1 = 0;
      int cnt2 = 0;
      int flag = 0;
      int memo1 = 0;
      int memo2 = 0;
      for(int i=0;i<lng;i++){
///////////////////////////////////////////
        if(c[i]=='>'){
          cnt1++;
          memo2=cnt1;
          ans += cnt1;
        }
        else{
          flag=1;
          memo2 = cnt1;
          cnt1=0;
        }
        if(flag==1 || i==lng-1){
          if(memo1>=memo2){
            ans -= memo2;
            memo1=0;
            memo2=0;
            flag=0;
          }
          if(memo1<memo2){
            ans -= memo1;
            memo1=0;
            memo2=0;
            flag=0;
          }
        }
///////////////////////////////////////////
        if(c[i]=='<'){
          cnt2++;
          ans += cnt2;
          if(i!=lng-1){ // not end
            if(c[i+1]=='>'){ //<>
              memo1 = cnt2;
            }
          }
        }
        else{
          cnt2=0;
        }
///////////////////////////////////////////
      }




      System.out.println(ans);

    }
}
