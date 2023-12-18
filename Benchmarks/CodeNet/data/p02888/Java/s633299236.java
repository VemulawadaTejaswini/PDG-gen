import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l[] = new int [n];
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
    }
    int answer =0;
    Arrays.sort(l);
    for(int i=2;i<n;i++){ //長い方を止め
      for(int j=0;j<i-1;j++){ //短い方を止め
        //長い方と短い方の間の流さでOKな組み合わせの数を、にぶたんで検索する
        answer = answer + okNum(l,j,i);
      }
    }
    System.out.println(answer);
    
  }
  
  //配列、短い方の添字、長い方の添字から、OKな組み合わせを検索する
  public static int okNum(int length[],int lowerInd,int upperInd){
    int upperLen = length[upperInd];
    int keepSup = upperInd;
    int lowerLen = length[lowerInd];
  //長辺の長さ<短辺の長さ+中辺の長さとなる中辺の数を返却したい  
    //⇔長辺-短辺<中辺となる中辺の数
    int target = upperLen - lowerLen;
    int cnt =0;
    int tmpLen=0;
    int tmpInd=0;
    boolean flg = true;
    while(flg){
      tmpLen=length[(upperInd+lowerInd)/2];
      tmpInd=(upperInd+lowerInd)/2;
      if(target<tmpLen){
        upperInd=tmpInd;
      }else{
        lowerInd=tmpInd;
      }
      if(upperInd-lowerInd<2){
        flg=false;
        tmpInd=upperInd;
      }
    }
    return keepSup-tmpInd;
  }
  
}
