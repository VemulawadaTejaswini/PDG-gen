import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Main{
    public boolean checkInteger(String a){
        try{
            Integer.parseInt(a);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public void run(){
        List<String> num = new ArrayList<>();
        parseInput().stream()
            .forEach(i -> {
                if(Objects.equals("insert", i[0])){
                    num.add(0, i[1]);
                }
                else if(Objects.equals("delete", i[0])){
                    num.remove(i[1]);
                }
                else if(Objects.equals("deleteFirst", i[0])){
                    num.remove(0);
                }
                else if(Objects.equals("deleteLast", i[0])){
                    num.remove(num.size() - 1);
                }
            });
        num.stream().forEach(i -> System.out.printf("%s " , i));
        System.out.println();
    }
    public List<String[]> parseInput(){
        return new BufferedReader(new InputStreamReader(System.in)).lines()
            .filter(n -> !Objects.equals(n, ""))
            .map(i -> i.split(" "))
            .filter(i -> !checkInteger(i[0]))
            .collect(Collectors.toList());
    }
    public static void main(String[] args){
        new Main().run();
    }
}