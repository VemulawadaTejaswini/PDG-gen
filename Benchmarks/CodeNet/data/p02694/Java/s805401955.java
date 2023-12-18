class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   long x = sc.nextLong();
	long money=100;
  long count=0;
   for(long i=0;i<10000000;i++ ){
     money=money*101/100;
     count=count+1;
     if(money>=x){
       
     break;
     }
   }