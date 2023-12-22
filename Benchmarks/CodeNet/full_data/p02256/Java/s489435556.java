import java.io.*;

class Main
{
 
  public static void main(String[] args)
  {
    try{
    	// ??\???????????????
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // ????????°???????????????
      //int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] array = new int[2];
 
      for(int i = 0; i < 2; i++){
        array[i] = Integer.parseInt(str[i]);
      }
      System.out.println(String.valueOf(getGraterValue(array[0],array[1])));
 
    }catch(Exception e){
      System.out.println(e);
    }
  }
 
  public static int getGraterValue(int a,int b){
	  
	  int greaterValue = a > b ? a : b;
	  if(a % greaterValue == 0 && b % greaterValue == 0)
	  {
		  return greaterValue;
	  }
	  else if(greaterValue < 2){
		  return 1;
	  }
	  else{
		  if(greaterValue == a){
			  // x > y
			  //gcd(x, y) = gcd(y, x%y)
			  return getGraterValue(b,a % b);
		  }
		  return getGraterValue(a,b % a);
	  }
  }
}