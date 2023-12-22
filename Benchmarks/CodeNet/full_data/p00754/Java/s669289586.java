package main;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String s = scan.nextLine();
            String[] slist = s.split("");
            StringStack stack = new StringStack(100);
            for (String item : slist) {
                if (item == "(" || item == "[") {
                    stack.push(item);
                } else if (item == ")") {
                    if (stack.pop() != "(") {
                        System.out.println("no");
                        break;
                    }
                } else if (item == "]") {
                    if (stack.pop() != "(") {
                        System.out.println("no");
                        break;
                    }
                }
            }
            System.out.println("yes");
        }
    }
}
