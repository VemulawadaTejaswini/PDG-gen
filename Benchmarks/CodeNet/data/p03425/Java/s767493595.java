import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> topM = new ArrayList<>();
        List<String> topA = new ArrayList<>();
        List<String> topR = new ArrayList<>();
        List<String> topC = new ArrayList<>();
        List<String> topH = new ArrayList<>();
        for (int i=0;i<N;i++){
            String name = sc.next();
            if (name.startsWith("M")){
                topM.add(name);
            }else if (name.startsWith("A")){
                topA.add(name);
            }else if (name.startsWith("R")){
                topR.add(name);
            }else if (name.startsWith("C")){
                topC.add(name);
            }else if (name.startsWith("H")){
                topH.add(name);
            }
        }
        List<List<String>> names = new ArrayList<>();
        names.add(topM); names.add(topA);
        names.add(topR); names.add(topC);
        names.add(topH);
        int result = 0;
        for (int i=0;i<5;i++){
            for (int j=i+1;j<5;j++){
                for (int k=j+1;k<5;k++){
                    result += names.get(i).size() * names.get(j).size() * names.get(k).size();
                }
            }
        }
        System.out.println(result);
    }
}