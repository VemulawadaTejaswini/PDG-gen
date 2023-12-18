        int a = scan.nextInt();
        int b = scan.nextInt();
        String ans = "";
        if (0 < a)
            ans = "Positive";
        if (a < =0 && 0 <= b)
            ans = "Zero";

        if (b < 0 && (b - a) % 2 == 0)
            ans = "Negative";

        System.out.println(ans);