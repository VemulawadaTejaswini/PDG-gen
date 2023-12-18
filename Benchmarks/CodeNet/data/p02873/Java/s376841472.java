import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

      
      String[] x=new String[499999];
      int i=0;
      for(i=0;i<499999;i++){
          x[i]=str.charAt(i);
      }

      i=0;
      int sum=0;
      for(i=0;i<499999;i++){
          if(x[i]==null){
              break;
        }
        sum=sum+1;
      }
      int[] y=new int[sum];
      if(x[0]=="<"){
          y[0]=0;
      }
      if(x[sum-1]==">"){
          y[sum]=0;
      }
      i=0;
        for(i=0;i<sum-1;i++){
            if((x[i]==">")&&(x[i+1]=="<")){
                y[i+1]=0;
            }
        }
      i=0;
        for(i=0;i<sum-1;i++){
            if((x[i]=="<")&&(x[i+1]=="<")){
                y[i+1]=y[i]+1;
            }
        }
      i=0;
        for(i=0;i<sum-1;i++){
            if((x[i]==">")&&(x[i+1]==">")){
                y[i+1]=y[i+2]+1;
            }
        }
      i=0;
        for(i=0;i<sum-1;i++){
            if((x[i]=="<")&&(x[i+1]==">")){
                y[i+1]=Math.max(y[i],y[i+2])+1;
            }
        }
      if(x[0]==">"){
          y[0]=y[1]+1;
      }
      if(x[sum-1]=="<"){
          y[sum]=y[sum-1]+1;
      }
      i=0;
      int summ=0;
        for(i=0;i<sum+1;i++){
            summ=summ+y[i];
        }
System.out.println(summ);


    }
}