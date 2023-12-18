public static void main(String[] args){
  int count5 = 0;
  int count7 = 0;
  
  for(String arg : args){
    if(arg.equals("5")){
      count5++;
    } else if(arg.equals("7")){
      count7++;
    }
  }
  
  if(count5 == 2 && count7 == 1){
  	System.out.println("YES");
  }else {
  	System.out.println("NO");
  }
}