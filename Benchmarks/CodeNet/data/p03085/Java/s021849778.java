import java.io.*;

class ATGC {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            char b = line.charAt(0);
            switch (b){
                case 'A':
                    System.out.println("T");
                    break;
                case 'T':
                    System.out.println("A");
                    break;
                case 'G':
                    System.out.println("C");
                    break;
                case 'C':
                    System.out.println("G");
                    break;
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}