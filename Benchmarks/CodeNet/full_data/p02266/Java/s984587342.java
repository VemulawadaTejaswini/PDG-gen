import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<int[]> puddles = new ArrayList<int[]>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\\') {
                stack.push(i);
            } else if (input.charAt(i) == '/' && !stack.empty()) {
                puddles.add(new int[] {stack.pop(), i});
            }
        }

        ArrayList<Integer> areas = new ArrayList<Integer>();
        int area;
        int totalArea = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int[] puddle: puddles) {
                if (puddle[0] == i) {
                    area = puddle[1] - puddle[0] + calcArea(puddle[0] + 1, puddle[1] - 1, puddles);
                    areas.add(area);
                    totalArea += area;
                    i = puddle[1] + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(totalArea).append("\n").append(areas.size());
        if (areas.size() > 0) {
            sb.append(" ").append(areas.remove(0));
            for (int a: areas) {
                sb.append(" ").append(a);
            }
        }

        System.out.println(sb.toString());
    }

    public static int calcArea(int first, int last, ArrayList<int[]> puddles) {
        int area = 0;
        for (int i = first; i < last; i++) {
            for (int[] puddle: puddles) {
                if (puddle[0] == i) {
                    area += puddle[1] - puddle[0] + calcArea(puddle[0] + 1, puddle[1] - 1, puddles);
                    i = puddle[1] + 1;
                }
            }
        }
        return area;
    }
}