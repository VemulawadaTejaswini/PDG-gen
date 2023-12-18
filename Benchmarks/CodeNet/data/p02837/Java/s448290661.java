import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a = new int[n];
    int[][] x = new int[n][n];
    int[][] y = new int[n][n];
    
    for(int i=0;i<n;i++){//証人ごと
      a[i]=sc.nextInt();
      for(int j=0;j<a[i];j++){//証言ごと
        x[i][j]=sc.nextInt();
        y[i][j]=sc.nextInt();
      }
    }
    
    int map =0;
    int ans=0;
    /*
          for(int i2=0;i2<n;i2++){
            System.out.println(i2);
            for(int j2=0;j2<a[i2];j2++){
              System.out.println(x[i2][j2]+" "+y[i2][j2]);
            }
          }
    */
    
    for(;map<Math.pow(n,2)-1;map++){//正直者,嘘つきのパターン
    //for(map=2;map<3;map++){
      
      Boolean[] honest = new Boolean[n];
      Boolean ok = true;//矛盾がないか
      int tempAns=0;//現パターンの正直者の人数
       
      for(int i=0;i<n;i++){
        if((map>>i)%2==1){
          honest[i] = true;
          tempAns++;
        }else honest[i] = false;
      }
      
      for(int i=0;i<n;i++){//証人ごと
        
        for(int j=0;j<a[i];j++){//証言ごと
          //Boolean temp =  honest[x[i][j]]==(y[i][j]==1);//test
          //System.out.println(honest[i] +" "+ i+" "+j+" " + temp);//test
          

          
          if(!honest[i])break;
          if(honest[x[i][j]-1]==(y[i][j]==1)){
          }else{
            ok = false;
            break;
          }
        }
        
        if(!ok)break;
      }
      
      //System.out.println(map + " " + ok);
      if(ok)ans = Math.max(ans,tempAns);
    }
    
    System.out.println(ans);
    
  }
}