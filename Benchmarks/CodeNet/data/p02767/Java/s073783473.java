        import java.util.*;
         
        public class Main {
        	public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                scan.nextLine();
                
                List<Integer> values = Arrays.sort(Arrays.of(scan.nextLine().split(" ")).map{i->new Integer(i)};);
        		Map<Integer,Integer> searchResult = new HashMap()<>;
                int i = 0;
                for(i;i<values.get(values.size-1);i++){
                  searchResult.put(calc(list,i),i);
                }
                searchResult
                        // キーでソートする
        		Object[] mapkey = mMap.keySet().toArray();
        		Arrays.sort(mapkey);
              	for (Integer nKey : mMap.keySet()){
            		System.out.println(mMap.get(nKey));
                    break;
        		}
            }
          
          	public static int calc(List<Integer> list,Integer point){
              Integer result = 0;
              int i = 0;
              for(i;i<list.size;i++){
                result += ((list.get(i) - point) * (list.get(i) - point));
              }
              return result;
            }
        }