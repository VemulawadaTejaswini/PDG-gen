import java.io.*;

class Main
{
 
  public static void main(String[] args)
  {
    try{
    	// ??\???????????????
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // ????????°???????????????
      int n = Integer.parseInt(br.readLine());
      int[] array = new int[n];
      int putnum = 0;
      while(true){
    	  String str = br.readLine();
    	  array[putnum] = Integer.parseInt(str);
    	  if(++putnum == n)break;
      }
      
      System.out.println(String.valueOf(getMaxNumber(array)));
 
    }catch(Exception e){
      System.out.println(e);
    }
  }
 
  public static int getMaxNumber(int array[]){
	  int maxNumber = Integer.MIN_VALUE;
	  int minNumber = array[0];
	  for(int i = 1;i < array.length;++i){
		  final int divide = array[i] - minNumber;
		  
		  if(divide > maxNumber){
			  maxNumber = divide;
		  }
		  
		  if(minNumber > array[i]){
			  minNumber = array[i];
		  }
	  }
	  return maxNumber;
  }
}