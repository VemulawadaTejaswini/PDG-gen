import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(System.in);
            int n = Integer.parseInt(readLine(reader));
            while (n-- > 0) {
                String[] ss = readLine(reader).split(" ");
                String s = ss[0];
                if ("insert".equals(s)) {
                    list.insert(ss[1]);
                } else if ("delete".equals(s)) {
                    list.delete(ss[1]);
                } else if ("deleteFirst".equals(s)) {
                    list.deleteFirst();
                } else if ("deleteLast".equals(s)) {
                    list.deleteLast();
                }
            }
        } catch (IOException e) {
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {}
            }
        }
        print(list.toArray());
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private String readLine(InputStreamReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = reader.read();
            char c = (char)n;
            if ((c == '\r' || c == '\n') && sb.length() > 0 || n == -1) break;
            sb.append(c);
        }
        return sb.toString();
    }
    
    private static class DoublyLinkedList<T> {
        Object[] list = new Object[0];
        int size = 0;
        
        public void insert(T x) {
            size += 1;
            Object[] newList;
            if (list.length < size) {
                newList = new Object[size*2];
            } else {
                newList = list;
            }
            for (int i = size - 1; 0 < i; i--) {
                newList[i] = list[i-1];
            }
            newList[0] = x;
            list = newList;
        }
        public void delete(T x) {
            if (size <= 0) return;
            int index;
            for (index = 0; index < size; index++) {
                if (list[index].equals(x)) {
                    break;
                }
            }
            if (index >= size) return;
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i+1];
            }
            size -= 1;
        }
        public void deleteFirst() {
            if (size <= 0) return;
            for (int i = 0; i < size - 1; i++) {
                list[i] = list[i+1];
            }
            size -= 1;
        }
        public void deleteLast() {
            if (size <= 0) return;
            size -= 1;
        }
        public Object[] toArray() {
            return Arrays.copyOf(list, size);
        }
    }
}