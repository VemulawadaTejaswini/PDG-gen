Int();
      t = in.nextInt();
      x = new int[n];
      for (int i = 0; i < n; ++i)
        x[i] = in.nextInt();
      if (n == 1) {
        out.println(e + t);
        return;
      }
      long ans = x[0];
      int idx = 0;
      while (idx < n - 1) { 
        long cnt = 2;
        int nxt = idx;
        long temp = (x[nxt] - x[idx]) + cnt * t;
        while (nxt < n && (long) Math.max(t, 2 * (x[nxt] - x[idx])) + (x[nxt] - x[idx]) < (x[nxt] - x[idx]) + cnt * t) {
          temp = (long) Math.max(t, 2 * (x[nxt] - x[idx])) + (x[nxt] - x[idx]);
          ++nxt;
          ++cnt;
        }
        ans += temp;
        if (nxt < n)
          ans += x[nxt] - x[nxt - 1];
        if (nxt == n - 1)
          ans += t;
        idx = nxt;
      }
      ans += e - x[n - 1];
      out.println(ans);
    }
    
  }
      
  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream));
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }
    
    public String nextLine() {
      try {
        return reader.readLine();
      } catch(IOException e) {
        throw new RuntimeException(e);
      }
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }
    
    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public boolean hasInput() {
      try {
        if (tokenizer != null && tokenizer.hasMoreTokens()) {
          return true;
        }
        reader.mark(1);
        int ch = reader.read();
        if (ch != -1) {
          reader.reset();
          return true;
        }
        return false;
      } catch(IOException e) {
        throw new RuntimeException(e);
      }
    }
    
  }
}
