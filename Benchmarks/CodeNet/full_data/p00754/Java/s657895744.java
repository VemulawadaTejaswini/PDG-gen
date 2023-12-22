//package aoj;

import java.util.Scanner;
import java.util.Stack;

class Main {
    public static boolean solve(String sentence) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == '[' || sentence.charAt(i) == '(') stk.push(sentence.charAt(i));
            else if(sentence.charAt(i) == ']') {
                if(stk.empty()) return false;
                if(stk.peek() != '[') return false;
                stk.pop();
            }
            else if(sentence.charAt(i) == ')') {
                if(stk.empty()) return false;
                if(stk.peek() != '(') return false;
                stk.pop();
            }
        }
        return stk.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String sentence = sc.nextLine();
            if(sentence.equals(".")) return;
            System.out.println(solve(sentence) ? "yes" : "no");
        }
    }
}

