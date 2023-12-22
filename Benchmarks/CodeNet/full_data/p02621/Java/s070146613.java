        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //--------------------------START CODING HERE-----------------------------

        String  line= f.readLine();

        int DA = Integer.parseInt(line);

        System.out.print((int)(Math.pow(DA,3)+Math.pow(DA,2)+Math.pow(DA,1)));