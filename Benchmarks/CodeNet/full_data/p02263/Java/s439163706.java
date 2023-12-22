import java.io.*;
import java.util.*;

class A{
    public A(){
        Deque<Integer> num = new ArrayDeque<>();
        new BufferedReader(new InputStreamReader(System.in)).lines()
            .filter(n -> !Objects.equals(n, ""))
            .map(i -> i.split(" "))
            .forEach(i -> Arrays.stream(i).forEach(n ->{
                if(Objects.equals(n ,"+")){
                    num.addFirst(num.removeFirst() + num.removeFirst());
                }
                else if(Objects.equals(n ,"-")){
                    int a = num.removeFirst();
                    int b = num.removeFirst();
                    num.addFirst((b - a));
                }
                else if(Objects.equals(n ,"*")){
                    num.addFirst((num.removeFirst() * num.removeFirst()));
                }else{
                    num.addFirst(Integer.parseInt(n));
                }
            }));
        System.out.println(num.removeFirst());
    }

    public static void main(String[] args){
        new A();
    }
}