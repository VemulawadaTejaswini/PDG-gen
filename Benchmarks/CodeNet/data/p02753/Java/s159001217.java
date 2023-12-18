    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    public class Test
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader reader =
                       new BufferedReader(new InputStreamReader(System.in));
            String[] stations = reader.readLine().split("");
            if (stations.length < 3){
            	System.exit(1);
            }
          
          	String first = null;
          boolean isAllSame = true;
          for (String station : stations){
          	if (first == null){
            	first = station;
            }else if (!first.equals(station){
            	isAllSame = false;
              break;
            }
          }
           
                      System.out.println(isAllSame ? "No":"Yes);
                      
        }
    }