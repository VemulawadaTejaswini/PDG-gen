import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            int arg, n;
            String line, command;
            n = Integer.parseInt(br.readLine());
            int array[] = new int[0];
            for (int i = 0; i < n ; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                command = st.nextToken();
                switch(command){
                    case "insert":
                        arg = Integer.parseInt(st.nextToken());
                        array = insert(array, arg);
                        break;
                    case "delete":
                        arg = Integer.parseInt(st.nextToken());
                        array = delete(array, arg);
                        break;
                    case "deleteFirst":
                        array = deleteFirst(array);
                        break;
                    case "deleteLast":
                        array = deleteLast(array);
                        break;
                }
            }
            for (int i : array) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString().trim());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static int[] insert(int[] array, int arg){
        int last = array.length;
        int[] tempArray = new int[last+1];
        tempArray[0] = arg;
        System.arraycopy(array, 0, tempArray, 1, last);
        return tempArray;
    }

    private static int[] delete(int[] array, int arg){
        boolean exist = false;
        int pos = 0;
        int last = array.length;
        for (int j = 0; j < last; j++) {
            if (array[j] == arg){
                pos = j;
                exist = true;
                break;
            }
        }
        int[] tempArray = new int[last-1];
        if(pos != 0) {
            System.arraycopy(array, 0, tempArray, 0, pos);
        }
        if(pos + 1 != last) {
            System.arraycopy(array, pos + 1, tempArray, pos, last - pos - 1);
        }
        return exist ? tempArray : array;
    }

    private static int[] deleteFirst(int[] array){
        int last = array.length;
        int[] tempArray = new int[last-1];
        System.arraycopy(array, 1, tempArray, 0, last-1);
        return tempArray;
    }

    private static int[] deleteLast(int[] array){
        int last = array.length;
        int[] tempArray = new int[last-1];
        System.arraycopy(array, 0, tempArray, 0, last-1);
        return tempArray;
    }
}