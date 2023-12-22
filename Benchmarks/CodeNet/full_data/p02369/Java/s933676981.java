
import java.util.*;

public class Main {
    static List<Integer> startPointList = new ArrayList<>();
    static List<Integer> endPointList = new ArrayList<>();
    static Set<Integer> vertexSet = new HashSet<>();

    public static void main(String args[]){
        Integer result = null;

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            Integer startPoint = Integer.parseInt(scanner.next());
            startPointList.add(startPoint);
            Integer endPoint = Integer.parseInt(scanner.next());
            endPointList.add(endPoint);
            vertexSet.add(startPoint);
            vertexSet.add(endPoint);
        }

        result = topological(vertexSet, startPointList, endPointList);
        judge(result);





    }

    public static Integer topological(Set<Integer> vertexSet, List<Integer> startPointList, List<Integer> endPointList){
        boolean notConnect = true;
        Iterator<Integer> verIterator = vertexSet.iterator();

        while (verIterator.hasNext()){
            Integer vertex = verIterator.next();
            Iterator<Integer> endIterator = endPointList.iterator();
            Iterator<Integer> startIterator = startPointList.iterator();
            while (endIterator.hasNext()){
                Integer endPoint = endIterator.next();
                Integer startPoint = startIterator.next();
                if(vertex.equals(endPoint)){
                    if(startPoint.equals(endPoint)){
                        startIterator.remove();
                        endIterator.remove();
                    }
                    notConnect = false;
                    break;
                }else {
                    notConnect = true;
                }
            }
            if(notConnect == true){
                Iterator<Integer> startIterator2 = startPointList.iterator();
                Iterator<Integer> endIterator2 = endPointList.iterator();
                while (startIterator2.hasNext()){
                    Integer startPoint = startIterator2.next();
                    Integer endPoint = endIterator2.next();
                    if(startPoint.equals(vertex)){
                        startIterator2.remove();
                        endIterator2.remove();
                    }
                }
                verIterator.remove();
            }
        }

        return startPointList.size();
    }

    static void judge(Integer result){
        Integer judge = null;

        if(result.equals(0)){
            System.out.println(0);
        }else {
            Integer result2 = topological(vertexSet, startPointList, endPointList);
            if(result.equals(result2)){
                System.out.println(1);
            }else {
                result = result2;
                judge(result);
                }

            }
        }

    }
