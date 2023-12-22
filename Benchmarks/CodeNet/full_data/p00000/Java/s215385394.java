class Main{
   public static void main(String[] args){
      int x,y;
   y=1;
do{
   for(x=0; x<10; ++x){
   System.out.println(y+"x"+x+"="+x*y);
   }
   ++y
   }while(y<10);
}
}