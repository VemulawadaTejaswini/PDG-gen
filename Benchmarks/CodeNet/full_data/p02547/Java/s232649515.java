public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");
        int n = Integer.parseInt(br.readLine());
        int res = 0;
        boolean found = false;
        for(int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals(st.nextToken())) {
                res++;
            }
            else {
                res = 0;
            }
            if(res == 3) {
                found = true;
            }
        }
        if(found) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }