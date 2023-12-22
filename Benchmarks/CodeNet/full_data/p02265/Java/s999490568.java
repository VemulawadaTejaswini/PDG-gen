// Double-linked List

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.lang.*;



public class Main {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> list = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            if (command.charAt(0) == 'i') {
                list.addFirst(Integer.valueOf(command.substring(7)));
            } else if (command.charAt(6) == 'F') {
                list.pop();
            } else if (command.charAt(6) == 'L'){
                list.removeLast();
            } else {
                list.remove(Integer.valueOf(command.substring(7)));
            }
            //System.out.println(list);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.pop());
            if (i != size - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();
    }
}
