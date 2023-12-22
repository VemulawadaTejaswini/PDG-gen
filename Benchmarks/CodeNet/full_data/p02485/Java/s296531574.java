public class Main{ 
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    while(true){
      int x = sc.nextInt();
      if(x==0) break;
      int k=0;
      int t = x;
      while(t>0){
        t /= 10;
        k++;
      }
      int S3 = 0;
      int [] S;
      int [] S2;
      S = new int [10000];
      S2 = new int [10000];
      int i = k-1;
      S2[k]=x;
      while(i>=0){
        while(true){
          S[i]=S2[i+1]/(int)Math.pow(10,i);
          if(S[i]==0){
            S2[i]=S2[i+1];
            i--;
            break;
          }
          else if(S[i]!=0){
            S2[i]=S2[i+1]-S[i]*(int)Math.pow(10,i);
            S3 = S3 + S[i];
            i--;
            break;
          }
        }
      }
      System.out.printf("%d\n",S3);
    }
  }
}
    