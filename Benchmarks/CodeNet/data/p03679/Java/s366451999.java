    public static void main(String[] args) throws IOException {
        // Here your code !
        BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
        String[] lineArray = br.readLine().split(" ", 0);
        int d = Integer.parseInt(lineArray[0]);
        int a = Integer.parseInt(lineArray[1]);
        int b = Integer.parseInt(lineArray[2]);

        if (b <= a) {
            System.out.println("delicious");
        } else if (b <= a + d) {
            System.out.println("safe");
        } else if (b > a + d) {
            System.out.println("dangerous");
        }
    }