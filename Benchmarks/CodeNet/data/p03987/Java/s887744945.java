    import java.io.*;                                                                                                                                           
     
    public class Main {
        public static void main(String[] args){
     
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
     
            try{
                String str1 = reader1.readLine();
                String str2 = reader2.readLine();
                int N = Integer.parseInt(str1);
                String[] s_array = str2.split("\\s");
                long[] array = new long[s_array.length];
     
                for(int i = 0 ; i < s_array.length ; i++)
                    array[i] = Long.parseLong(s_array[i]);
     
                long result = 0,sum = 0 ;
                long min;
                for(int l = 0; l < N ; l++){
                    sum = 0;
		    min = array[l];		     
                    for(int r = l; r < N ; r++){
			if (array[r] < min) {
			    min = array[r];
			}
			sum += min;
			// min = Math.min(min,array[l]);
                        // sum = min + sum;
                        // System.out.println(sum);
                    }
                    result = sum + result;
                }
     
                System.out.println(result);
     
            }catch (IOException e){
                System.out.println(e);
            }
        }
    }
