import java.util.*;

public class Main{


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Map<String,String> convTable = new HashMap<>();
        int convSize =  Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < convSize; i++) {
            String[] conv = scanner.nextLine().split(" ");
            convTable.put(conv[0], conv[1]);
        }

        final List<List<String>> outputList = new ArrayList<>();
        int inputSize = Integer.parseInt(scanner.nextLine());
        while(inputSize != 0) {
            List<String> output = new ArrayList<>();
            for(int i = 0; i < inputSize; i++) {
                String inputStr = scanner.nextLine();
                if(convTable.containsKey(inputStr)) {
                    output.add(convTable.get(inputStr));
                }else{
                    output.add(inputStr);
                }
            }
            outputList.add(output);
            inputSize = Integer.parseInt(scanner.nextLine());
        }

        outputList.stream()
                .map(list -> list.stream().reduce((v1,v2) -> v1+v2).get())
                .forEach(System.out::println);
    }
}