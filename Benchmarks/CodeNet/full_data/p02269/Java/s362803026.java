import java.util.Scanner;

class ACGTHashList {
    private int M;
    private String[] H;

    public ACGTHashList(int M) {
        this.M = M;
        this.H = new String[M];
        for (int i = 0; i < M; i++) this.H[i] = "";
    }

    private static int ACGTtoInt(char c) {
        switch (c) {
            case 'A': return 1;
            case 'C': return 2;
            case 'G': return 3;
            case 'T': return 4;
        }
        return 0;
    }

    private int getKey(String str) {
        int sum = 0;
        for (int i = 0, p = 1; i < str.length(); i++, p *= 5) {
            sum += p * ACGTtoInt(str.charAt(i));
        }
        return sum;
    }

    private int h1(int key) {
        return key % this.M;
    }

    private int h2(int key) {
        return 1 + key % (this.M - 1);
    }

    public boolean find(String str) {
        int key = getKey(str);
        int h;
        int h1 = h1(key), h2 = h2(key);
        for (int i = 0;; i++) {
            h = (h1 + i* h2) % this.M;
            if (this.H[h].equals(str)) return true;
            else if (this.H[h].equals("")) return false;
        }
    }

    public boolean insert(String str) {
        int key = getKey(str);
        int h;
        int h1 = h1(key), h2 = h2(key);
        for (int i = 0;; i++) {
            h = (h1 + i * h2) % this.M;
            if (this.H[h].equals(str)) return false;
            else if (this.H[h].equals("")) {
                this.H[h] = str;
                return true;
            }
        }
    }
}


class Main {
    public static void main(String[] args) {
        ACGTHashList list = new ACGTHashList(1046527);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            String key = sc.next();
            switch(command.charAt(0)) {
            case 'i':
                list.insert(key);
                break;
            case 'f':
                System.out.println(list.find(key) ? "yes" : "no");
            }
        }
    }
}

