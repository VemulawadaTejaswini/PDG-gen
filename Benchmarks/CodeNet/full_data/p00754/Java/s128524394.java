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
            System.out.println("no");
        }
    }
}

class StringStack {
    private String[] data;
    private int size;
    private int capacity;

    public StringStack(int capacity) {
        this.data = new String[capacity];
        this.size = 0;
    }

    public void push(String item) {
        size += 1;
        data[size] = item;
    }

    public String peek() {
        return data[size];
    }

    public String pop() {
        size -= 1;
        return data[size + 1];
    }

    public boolean empty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

}


