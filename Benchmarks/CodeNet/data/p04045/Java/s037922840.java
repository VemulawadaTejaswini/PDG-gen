// Iroha's Obasession

import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int K=sc.nextInt();
    int N=sc.nextInt();

    int  array[]=new int[N];

    for(int i=0;i<N;i++){
      array[i]=sc.nextInt();
    }

    boolean flag=true;
    int ans=0;
    int i=1;



    do{
        ans=K*i;
        String str=(Integer.toString(ans));
        String[] str2=str.split("");
        int count=0;

        for(int x=0;x<str.length();x++){
          for(int y=0;y<N;y++){
            //System.out.println(str2[x]+" "+array[y]);
            if(Integer.parseInt(str2[x])==array[y]){
              x=N-1;
              break;
            }
            count++;
          }
        }
        //System.out.println(count);
        //System.out.println(str.length()*N);
        if(count==N*str.length()) flag=false;
        i++;

    }while(flag);



    System.out.println(ans);


  }
}
