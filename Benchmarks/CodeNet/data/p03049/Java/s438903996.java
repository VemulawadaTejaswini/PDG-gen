import java.util.Scanner;

public class Main{
  public static int min(int n,int m){
    if(n<m) return n;
    else return m;
  }
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String str[]=new String[n];
    int cnt[]=new int[n];
    int flg1=0;
    int flg2=0;
    int flg3=0;
    
    int flg=0;

    for(int i=0;i<n;i++){
      str[i]=sc.next();
    }
    
    int ans=0;
    
    for(int i=0;i<n;i++){
      flg=0;
      for(int j=0;j<str[i].length();j++){
        char s=str[i].charAt(j);
        if(s=='A'){
          flg=1;
        }
        else if(s=='B'&&flg==1){
          ans+=1;
          flg=0;
        }
        else{
          flg=0;
        }
      }
    }
    
    for(int i=0;i<n;i++){
      char s=str[i].charAt(str[i].length()-1);
      char ss=str[i].charAt(0);
      
      if(s=='A') cnt[i]+=1;
      
      if(ss=='B') cnt[i]+=2;
      
      switch(cnt[i]){
        case 1:
          flg1+=1;
          break;
        case 2:
          flg2+=1;
          break;
        case 3:
          flg3+=1;
          break;
        default:
      }
    }
    ans+=min(flg1,flg2);
    if(flg3==0){
      System.out.println(ans);
    }
    else{
      if(flg1+flg2==0){
        System.out.println(ans+flg3-1);
      }
      else{
        System.out.println(ans+flg3);
      }
    }
  }
}
