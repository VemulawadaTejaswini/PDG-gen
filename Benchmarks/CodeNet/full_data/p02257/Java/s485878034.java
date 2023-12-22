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
      
      System.out.println(String.valueOf(getPrimeNumber(array)));
 
    }catch(Exception e){
      System.out.println(e);
    }
  }
 
  public static int getPrimeNumber(int array[]){
	  int total = 0;
	  for(int i = 0;i < array.length;++i){
		  boolean isPrime = true;
		  if(array[i] % 2 == 0 || array[i] == 1){
			  isPrime = false;
		  }
		  else{
			  for(int j = 3;j <= Math.sqrt(array[i]);j += 2){
			  //for(int j = 3;j < array[i];j += 2){
				if(array[i] % j == 0){
					isPrime = false;
					break;
				}
			}
		  }
		  if(isPrime || array[i] == 2)total++;
	  }
	  return total;
  }
}