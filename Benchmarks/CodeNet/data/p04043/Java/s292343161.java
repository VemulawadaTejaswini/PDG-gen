class Main{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    
    if(a+b+c!=17){
      System.out.println("NO");
    }else{
      if((a==5 || a==7)&&(b==5 || b==7)){
        System.out.println("YES");
      }
    }
  }
}
